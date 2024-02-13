package sd;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class test {
	public static void main(String[] args) {  
	    Resource resource=new ClassPathResource("sd/NewFile.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    emp e=(emp)factory.getBean("empbean");  
	    e.display(); 
	}  
}
