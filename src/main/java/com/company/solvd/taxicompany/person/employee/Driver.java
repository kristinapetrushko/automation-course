package com.company.solvd.taxicompany.person.employee;
import com.company.solvd.taxicompany.interfaces.IDriver;
import com.company.solvd.taxicompany.exception.SalaryZeroException;
import com.company.solvd.taxicompany.transport.Transport;
import org.apache.commons.lang3.RandomUtils;
import org.apache.log4j.Logger;


public class Driver extends Employee implements IDriver {

    public static final Logger LOGGER = Logger.getLogger(Driver.class);

    private boolean isAvailible;

    public Driver(String name, double salary) throws SalaryZeroException {
        super(name, salary);
        this.isAvailible = RandomUtils.nextBoolean();
    }

    public boolean isAvailible() {
        return isAvailible;
    }

    public void setAvailible(boolean availible) {
        isAvailible = availible;
    }

    @Override
    public void talkToTheClient() {
        LOGGER.info("Let`s go?");
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name=" + getName() + '\'' +
                ", isAvailible=" + isAvailible + '\'' +
                '}';
    }
}