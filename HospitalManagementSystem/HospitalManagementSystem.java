import java.util.*;

// Patient Class
class Patient {
    private int id;
    private String name;
    private int age;
    private String ailment;

    public Patient(int id, String name, int age, String ailment) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getAilment() { return ailment; }
    
    @Override
    public String toString() {
        return "Patient ID: " + id + ", Name: " + name + ", Age: " + age + ", Ailment: " + ailment;
    }
}

// Appointment Class
class Appointment {
    private int appointmentId;
    private Patient patient;
    private String doctorName;
    private Date date;

    public Appointment(int appointmentId, Patient patient, String doctorName, Date date) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctorName = doctorName;
        this.date = date;
    }

    public int getAppointmentId() { return appointmentId; }
    public Patient getPatient() { return patient; }
    public String getDoctorName() { return doctorName; }
    public Date getDate() { return date; }

    @Override
    public String toString() {
        return "Appointment ID: " + appointmentId + ", Patient: " + patient.getName() + ", Doctor: " + doctorName + ", Date: " + date;
    }
}

// Billing Class
class Billing {
    private int billId;
    private Patient patient;
    private double amount;

    public Billing(int billId, Patient patient, double amount) {
        this.billId = billId;
        this.patient = patient;
        this.amount = amount;
    }

    public int getBillId() { return billId; }
    public Patient getPatient() { return patient; }
    public double getAmount() { return amount; }
    
    @Override
    public String toString() {
        return "Bill ID: " + billId + ", Patient: " + patient.getName() + ", Amount: $" + amount;
    }
}

// Inventory Management Class
class Inventory {
    private String itemName;
    private int quantity;

    public Inventory(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public int getQuantity() { return quantity; }
    
    public void addStock(int amount) {
        this.quantity += amount;
    }
    
    public void useStock(int amount) {
        if (this.quantity >= amount) {
            this.quantity -= amount;
        } else {
            System.out.println("Not enough stock for " + itemName);
        }
    }

    @Override
    public String toString() {
        return "Item: " + itemName + ", Quantity: " + quantity;
    }
}

// Main System Class
public class HospitalManagementSystem {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        List<Appointment> appointments = new ArrayList<>();
        List<Billing> bills = new ArrayList<>();
        List<Inventory> inventoryList = new ArrayList<>();
        
        // Adding Sample Data
        Patient p1 = new Patient(1, "John Doe", 30, "Flu");
        patients.add(p1);
        
        Appointment a1 = new Appointment(101, p1, "Dr. Smith", new Date());
        appointments.add(a1);
        
        Billing b1 = new Billing(201, p1, 200.50);
        bills.add(b1);
        
        Inventory i1 = new Inventory("Syringes", 50);
        inventoryList.add(i1);
        
        // Displaying Data
        System.out.println(p1);
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(i1);
    }
}
