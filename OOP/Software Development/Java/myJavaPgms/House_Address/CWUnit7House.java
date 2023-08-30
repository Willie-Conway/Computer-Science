/******************************************
 * Willie Conway
 * CWUnit7.java
 *
 * House class for CWUit7
 * Mostly just an empty container for house related information.
 * 
 * This is the driver for house file.
 * ****************************************/

public class CWUnit7House
{
  String street, city, state, zipCode;
  int number;

  public CWUnit7House() {
    street = "No Street";
    city = "No City";
    state = "No State";
    zipCode = "No ZipCode";
    number = 0;
  }

  public CWUnit7House(int number, String street, String city, String state, String zipCode) {
    this.street = street;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;
    this.number = number;
  }


  public CWUnit7House setStreet(String street)
  {
    this.street = street;
    return this;
  }

  public CWUnit7House setCity(String city)
  {
    this.city = city;
    return this;
  }

  public CWUnit7House setState(String state)
  {
    this.state = state;
    return this;
  }

  public CWUnit7House setZipCode(String zipCode)
  {
    this.zipCode = zipCode;
    return this;
  }

  public CWUnit7House setNumber(int number)
  {
    this.number = number;
    return this;
  }

  //Just prints house info to stdout
  public void print()
  {
    System.out.println("House Information");
    System.out.println("Number: " + this.number);
    System.out.println("Street: " + this.street);
    System.out.println("City: " + this.city);
    System.out.println("State: " + this.state);
    System.out.println("Zip: " + this.zipCode);
    System.out.println("");
  }
}
