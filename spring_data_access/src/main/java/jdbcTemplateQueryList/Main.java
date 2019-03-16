package jdbcTemplateQueryList;

import jdbcQueryForMap.QueryMap;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring.xml");
        
        QueryList queryList=applicationContext.getBean(QueryList.class);
        queryList.queryList();
    }
}
