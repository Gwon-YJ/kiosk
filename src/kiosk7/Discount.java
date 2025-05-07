package kiosk7;
// 1. 속성

// 2. 생성자

// 3. 기능
public enum Discount {
        VETERAN(0.10), // 국가유공자 10%
        SOLDIER(0.05),   // 군인 5%
        STUDENT(0.03),  // 학생 3%
        GENERAL(0.00);   // 일반 0%

        private double rate;


        Discount(double rate) {
            this.rate = rate;
        }

        public double getRate() {
            return rate;
        }
    }
