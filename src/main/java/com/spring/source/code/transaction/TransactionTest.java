package com.spring.source.code.transaction;

import com.spring.source.code.transaction.entities.AccountDO;
import com.spring.source.code.transaction.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

import java.math.BigDecimal;


/**
 * @Transactional 注解用于在Spring应用程序中管理事务。该注解可以应用于类或方法级别，以控制在方法执行过程中如何管理事务。以下是每个参数的详细解释：
 *
 * 1. String value() / String transactionManager()
 *
 * 	•	含义: 这两个参数是互为别名的，主要用于指定事务管理器的名称。如果你的应用程序中有多个事务管理器，可以通过指定名称来选择使用哪个事务管理器。
 * 	•	默认值: 空字符串，表示使用默认的事务管理器。
 *
 * 2. Propagation propagation()
 *
 * 	•	含义: 定义事务的传播行为。传播行为决定了事务方法如何参与现有事务。如果存在多个事务，传播行为将决定它们之间的关系。
 * 	•	默认值: Propagation.REQUIRED
 * 	•	常用选项:
 * 	•	REQUIRED: 默认传播行为，当前方法必须运行在事务中。如果当前没有事务，Spring将创建一个新事务。
 * 	•	REQUIRES_NEW: 总是创建一个新事务。如果当前已经有事务，挂起当前事务。
 * 	•	SUPPORTS: 当前方法不需要事务，如果有现有事务则支持该事务。
 * 	•	NOT_SUPPORTED: 当前方法不需要事务，如果有现有事务，将其挂起。
 * 	•	MANDATORY: 当前方法必须在事务中运行，如果没有现有事务，抛出异常。
 * 	•	NEVER: 当前方法不需要事务，如果有现有事务，抛出异常。
 * 	•	NESTED: 在现有事务内创建一个嵌套事务，如果现有事务回滚，嵌套事务也会回滚。
 *
 * 3. Isolation isolation()
 *
 * 	•	含义: 定义事务的隔离级别。隔离级别决定了事务之间如何隔离彼此的数据操作，以避免并发问题。
 * 	•	默认值: Isolation.DEFAULT，使用数据库的默认隔离级别。
 * 	•	常用选项:
 * 	•	DEFAULT: 使用数据库的默认隔离级别。
 * 	•	READ_UNCOMMITTED: 允许读到未提交的数据（脏读）。
 * 	•	READ_COMMITTED: 只允许读到已提交的数据，防止脏读。
 * 	•	REPEATABLE_READ: 确保在事务期间读取的数据不会被其他事务修改（防止不可重复读）。
 * 	•	SERIALIZABLE: 最严格的隔离级别，完全串行化执行，避免任何并发问题，但性能较低。
 *
 * 4. int timeout()
 *
 * 	•	含义: 定义事务的超时时间（以秒为单位）。如果事务在指定时间内没有完成，将回滚事务。
 * 	•	默认值: -1，表示没有超时时间，事务将一直等待完成。
 *
 * 5. boolean readOnly()
 *
 * 	•	含义: 声明事务是否是只读的。只读事务会针对优化进行一些特定处理，如忽略锁定机制。适用于不进行数据修改的事务。
 * 	•	默认值: false，表示事务不是只读的。
 *
 * 6. Class<? extends Throwable>[] rollbackFor()
 *
 * 	•	含义: 指定一个或多个异常类，如果在事务过程中抛出这些异常，事务将回滚。
 * 	•	默认值: 空数组，表示只对未检查异常（RuntimeException 和 Error）进行回滚。
 *
 * 7. String[] rollbackForClassName()
 *
 * 	•	含义: 类似于 rollbackFor，但使用的是异常类的全限定名（类名字符串）。
 * 	•	默认值: 空数组。
 *
 * 8. Class<? extends Throwable>[] noRollbackFor()
 *
 * 	•	含义: 指定一个或多个异常类，如果在事务过程中抛出这些异常，事务不会回滚。
 * 	•	默认值: 空数组，表示只要抛出未检查异常（RuntimeException 和 Error），事务将回滚。
 *
 * 9. String[] noRollbackForClassName()
 *
 * 	•	含义: 类似于 noRollbackFor，但使用的是异常类的全限定名（类名字符串）。
 * 	•	默认值: 空数组。
 *
 * 总结
 *
 * @Transactional 注解提供了灵活的参数配置，可以根据业务需求对事务管理的行为进行精细化控制。通过配置传播行为、隔离级别、超时时间、只读标志和回滚条件，可以确保应用程序的事务管理符合业务逻辑的要求。
 */
public class TransactionTest {


    /**
     * xml 与注解相结合的方式
     */
    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("transaction_annoation.xml");
        IAccountService accountService = context.getBean("accountServiceImpl", IAccountService.class);

        AccountDO addAccountDO = new AccountDO();
        addAccountDO.setId(1);
        addAccountDO.setBalance(BigDecimal.valueOf(60));

        AccountDO subAccountDO = new AccountDO();
        subAccountDO.setId(2);
        subAccountDO.setBalance(BigDecimal.valueOf(4000));
        accountService.addSubBalance(addAccountDO, subAccountDO);

        System.out.println("执行完毕");
    }

    /**
     * 完全基于注解的方式
     */
    @Test
    public void test2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TransactionSpringConfig.class);
        IAccountService accountService = context.getBean("accountServiceImpl", IAccountService.class);

        AccountDO addAccountDO = new AccountDO();
        addAccountDO.setId(1);
        addAccountDO.setBalance(BigDecimal.valueOf(60));

        AccountDO subAccountDO = new AccountDO();
        subAccountDO.setId(2);
        subAccountDO.setBalance(BigDecimal.valueOf(4000));
        accountService.addSubBalance(addAccountDO, subAccountDO);

        System.out.println("执行完毕");

    }


    /**
     *  完全基于xml的方式
     */
    @Test
    public void test3() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("transaction_xml.xml");
        IAccountService accountService = context.getBean("accountServiceImpl", IAccountService.class);

        AccountDO addAccountDO = new AccountDO();
        addAccountDO.setId(1);
        addAccountDO.setBalance(BigDecimal.valueOf(60));

        AccountDO subAccountDO = new AccountDO();
        subAccountDO.setId(2);
        subAccountDO.setBalance(BigDecimal.valueOf(4000));
        accountService.addSubBalance(addAccountDO, subAccountDO);

        System.out.println("执行完毕");
    }


}
