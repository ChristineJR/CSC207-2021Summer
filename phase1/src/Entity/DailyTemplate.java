package Entity;

import java.io.Serializable;

/**
 * An subclass of the parent class Template (DailyTemplate).
 * It initially has a unique id (starts from 10000) and type (daily or monthly),
 * they can't be modified.
 * It also has three attributes: MinTimeBtwEvents, MinTimeOfEvent, MaxTimeOfEvent,
 * they have default values and could be modified by admin users.
 *
 * DailyTemplate can be created by the constructor immediately.
 *
 * templateId:  unique id, use an iterator to generate id, starting from 10000
 * MinTimeBtwEvents:  default value is 0.0 hour
 * MinTimeOfEvent: default value is 0.5 hour
 * MaxTimeOfEvent: default value is 24.0 hours
 */
public class DailyTemplate extends Template implements Serializable {

    public String type = "DailyTemplate";
    public double MinTimeBtwEvents = 0.0; // default unit is hour
    public double MinTimeOfEvent = 0.5; // unit hour
    public double MaxTimeOfEvent = 24.0; // unit hour

    /**
     * Inherits the method of the super class Template.
     * Creates a DailyTemplate with a unique templateID,
     * assigned by iterator (starts from 10000),
     * whenever a DailyTemplate is created,
     * its templateID is one more than the last template's id.
     */
    public DailyTemplate() {
        super();
    }

    /**
     * Overwrites the method of the super class Template.
     * Sets the minimum time between two events as a double
     * called MinTimeBtwEvents of the template.
     * It is a setter of MinTimeBtwEvents of the template.
     *
     * @param MinTimeBtwEvents the minimum time between two events
     *                         default value is 0.0 hour
     */
    public void setMinTimeBtwEvents(double MinTimeBtwEvents){
        this.MinTimeBtwEvents = MinTimeBtwEvents;
    }

    /**
     * Overwrites the method of the super class Template.
     * Sets the minimum time of a event as a double
     * called MinTimeOfEvent of the template.
     * It is a setter of MinTimeOfEvent of the template.
     *
     * @param MinTimeOfEvent the minimum time of an event
     *                         default value is 0.0 hour
     */
    public void setMinTimeOfEvent(double MinTimeOfEvent){this.MinTimeOfEvent = MinTimeOfEvent;}

    /**
     * Overwrites the method of the super class Template.
     * Sets the maximum time of a event as a double
     * called MaxTimeOfEvent of the template.
     * It is a setter of MaxTimeOfEvent of the template.
     *
     * @param MaxTimeOfEvent the maximum time of an event
     *                         default value is 0.0 hour
     */
    public void setMaxTimeOfEvent(double MaxTimeOfEvent){this.MaxTimeOfEvent = MaxTimeOfEvent;}

    /**
     * Overwrites the method of the super class Template.
     * Returns the minimum time between two events called MinTimeBtwEvents.
     * It is a getter of MinTimeBtwEvents of a template.
     *
     * @return the the minimum time between two events
     */
    public double getMinTimeBtwEvents(){return this.MinTimeBtwEvents;}

    /**
     * Overwrites the method of the super class Template.
     * Returns the minimum time of an event called MinTimeOfEvents.
     * It is a getter of MinTimeOfEvent of a template.
     *
     * @return the minimum time of an event
     */
    public double getMinTimeOfEvent(){return this.MinTimeOfEvent;}

    /**
     * Overwrites the method of the super class Template.
     * Returns the maximum time of an event called MaxTimeOfEvents.
     * It is a getter of MaxTimeOfEvent of a template.
     *
     * @return the maximum time of an event
     */
    public double getMaxTimeOfEvent(){return this.MaxTimeOfEvent;}

    /**
     * Overwrites the method of the super class Template.
     * Returns a string that is the type of a template.
     * It is a getter of type of a template.
     *
     * @return the type of the template
     */
    public String getTemplateType(){return this.type;
    }

// For test !!!
//    public static void main(String[] args) {
//        Template t2 = new DailyTemplate();
//        System.out.println(t2.getTemplateId());
//        System.out.println(t2.getTemplateType());
//        System.out.println(t2.getMaxTimeOfEvent());
//        Template t4 = new MonthlyTemplate();
//        System.out.println(t4.getTemplateId());
//    }
}
