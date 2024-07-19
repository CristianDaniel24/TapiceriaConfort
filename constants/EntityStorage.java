package Proyecto.TapiceriaConfort.constants;

import Proyecto.TapiceriaConfort.entities.*;
import Proyecto.TapiceriaConfort.storage.GenericStorage;

public class EntityStorage {
    public static final GenericStorage<Employee> employeeStorage = new GenericStorage<>(StorageConstants.EMPLOYEE_STORAGE);
    public static final GenericStorage<Customer> customerStorage = new GenericStorage<>(StorageConstants.CUSTOMER_STORAGE);
    public static final GenericStorage<Provider> providerStorage = new GenericStorage<>(StorageConstants.PROVIDER_STORAGE);
    public static final GenericStorage<Service> serviceStorage = new GenericStorage<>(StorageConstants.SERVICE_STORAGE);
    public static final GenericStorage<Bill> billStorage = new GenericStorage<>(StorageConstants.BILL_STORAGE);
}
