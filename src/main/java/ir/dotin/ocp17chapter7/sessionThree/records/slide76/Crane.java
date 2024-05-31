package ir.dotin.ocp17chapter7.sessionThree.records.slide76;

public record Crane(int numberEggs, String name) {
    /**
     * You can add methods, static fields, and other data types.
     * You cannot add instance fields outside the record declaration, even if they are private.
     * Records also do not support instance initializers.
     * All initialization for the fields of a record must happen in a constructor.
     */
    private static int type = 10;
//    public int size;            //DOES NOT COMPILE
//    private boolean friendly;   //DOES NOT COMPILE
}
