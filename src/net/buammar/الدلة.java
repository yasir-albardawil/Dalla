package net.buammar;

/**
 * @author Yasir Albardawil
 */
public class الدلة {
    private String نوع_السائل;
    private  final double كمية_السائل_في_الكأس;
    private final double حجم_الكأس;
    private double حجم_السائل;



    public الدلة(String نوع_السائل, double حجم_الدلة, double كمية_السائل) {
        this.نوع_السائل = نوع_السائل;
        كمية_السائل_في_الكأس = حجم_الدلة;
        حجم_الكأس = كمية_السائل;
        حجم_السائل = كمية_السائل_في_الكأس;
	
        System.out.println("--------------------[دلة ال" + نوع_السائل + "]--------------------");
    }


    public void تعبئة() {
        تعبئة(كمية_السائل_في_الكأس-حجم_السائل);
    }

    public void تعبئة(double كمية_السائل) {

        if (حجم_السائل > 0) {
            double newAmount = this.حجم_السائل + حجم_السائل;
            if (newAmount <= كمية_السائل_في_الكأس) {
                this.حجم_السائل = newAmount;
                System.out.println("تم إضافة " + حجم_السائل + " لتر من ال" + كمية_السائل);
            } else {
                System.out.println("دلة ال" + نوع_السائل + " زائدة بمقدار " + (حجم_السائل-كمية_السائل_في_الكأس) + " لتر لا يمكنك الإضافة.  يجب أن تنقص " + (حجم_السائل-كمية_السائل_في_الكأس) + " لتر من ال" + نوع_السائل);
            }
        } else {
            System.out.println("يجب أن يكون حجم السائل لل" + نوع_السائل + "أكبر من 0");
        }

    }


    public void تقديم(int عدد_مرات_التقديم) {
        int count = (int)getFanajeen();
        if (عدد_مرات_التقديم > 0) {
            for (int i =0; i < count; i++) {
                if (!هل_فارق()) {
                    if (getFanajeen() >= 1) {
                        System.out.println("تقديم القليل من ال" + نوع_السائل + " " + حجم_السائل + " [-"+حجم_الكأس+" لتر]");
                        حجم_السائل -= حجم_الكأس;
                    }
                } else {
                    System.out.println("دلة ال" + نوع_السائل + " فارغة");
                }
            }
        } else {
            System.out.println("يجب أن يكون حجم السائل أكبر من 0");
        }

        getlastLiquidAmount();

    }

    public void serve(int عدد_مرات_التقديم, double كمية_السائل) {
        int count = (int)getFanajeen();
        if (عدد_مرات_التقديم > 0) {
            for (int i =0; i < count; i++) {
                if (!هل_فارق()) {
                    if (getFanajeen() >= 1) {
                        System.out.println("تقديم القليل من ال" + نوع_السائل + " " + عدد_مرات_التقديم + " [-"+حجم_الكأس+" لتر]");
                        عدد_مرات_التقديم -= حجم_الكأس;
                    }
                } else {
                    System.out.println("الدلة فارغة");
                }
            }
        } else {
            System.out.println("يجب أن يكون العدد أكبر من 0");
        }

        getlastLiquidAmount();
    }


    public void تقديم_كامل_الدلة() {
        while (getFanajeen() >= 1) {
            System.out.println("تقديم القليل من ال" + نوع_السائل + " " + حجم_السائل + " [-"+حجم_الكأس+"]");
            حجم_السائل -= حجم_الكأس;

        }

        getlastLiquidAmount();
    }

    private double getFanajeen() {
        return حجم_السائل/حجم_الكأس;
    }

    private void getlastLiquidAmount() {
        if ((حجم_السائل < حجم_الكأس) && حجم_السائل > 0) {
            System.out.println("تقديم القليل من ال" + نوع_السائل + " " + حجم_السائل + " [-"+حجم_السائل+" لتر]");
            حجم_السائل = حجم_السائل - حجم_السائل;
        }
    }


    private boolean هل_فارق() {
        return حجم_السائل == 0;
    }

    public void كمية_السائل_في_الدلة() {
        if (حجم_السائل > 0) {
            System.out.println("لديك دلة تحتلوي على " + حجم_السائل + " لتر من ال" + نوع_السائل);
        } else {
            System.out.println("دلة ال" + نوع_السائل + " فارغة");
        }
    }


    public void تنظيف_الدلة() {
        if (هل_فارق()) {
            System.out.println("تم غسل دلة ال" + نوع_السائل);
        }
    }

}
