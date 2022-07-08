import db.dao.CouponDao;
import db.dao.CouponDaoImpl;
import model.Coupon;

import java.util.List;

public class TestCouponDao {
    public static void main(String[] args) {
        CouponDao dao = new CouponDaoImpl();

        List<Coupon> coupons = dao.findAllCustomerCoupon(2);

        System.out.println(coupons);
    }
}
