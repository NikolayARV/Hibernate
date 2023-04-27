import model.City;
import model.Employee;
import service.CityDao;
import service.CityDaoImpl;
import service.EmployeeDao;
import service.EmployeeDaoImpl;

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

        EmployeeDao employeeDao = new EmployeeDaoImpl();
        CityDao cityDao = new CityDaoImpl();

        City forest = new City(5, "FunForest");
        cityDao.add(forest);
        Employee forst = new Employee(2, "Vlad", "Vladov", "m", 27, forest);
        employeeDao.add(forst);
        employeeDao.getById(3);

        employeeDao.getAllEmployee();


    }

}
