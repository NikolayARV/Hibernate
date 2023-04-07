import model.City;
import model.Employee;
import service.CityDao;
import service.CityDaoImpl;
import service.EmployeeDaoImpl;

import javax.persistence.*;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        //EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        //        EntityManager entityManager = entityManagerFactory.createEntityManager();
        //
        //        entityManager.getTransaction().begin();
        //
        //        String jpqlQuery = "SELECT e FROM Employee e WHERE e.id= :minAge";
        //        TypedQuery<Employee> query = entityManager.createQuery(jpqlQuery, Employee.class);
        //        query.setParameter("minAge", 8);
        //        List<Employee> employees = query.getResultList();
        //        System.out.println(employees);
        //
        //        entityManager.getTransaction().commit();
        //
        //
        //
        //        entityManager.close();
        //        entityManagerFactory.close();

        EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
        CityDao cityDao = new CityDaoImpl();

        System.out.println(cityDao.getById(2));

        }

    }
