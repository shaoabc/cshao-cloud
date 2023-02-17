package cs.cshao.common.utils;


import cs.cshao.common.utils.string.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateUtils {

    //时间格式类型 默认格式为：yyyy-MM-dd HH:mm:ss
    public final static String DATE_FORMATE_HHMMSS = "HH:mm:ss";
    public final static String DATE_FORMATE_YYYY = "yyyy";
    public final static String DATE_FORMATE_YYYY_MMDD = "yyyyMMdd";
    public final static String DATE_FORMATE_YYYY_MM = "yyyy_MM";
    public final static String DATE_FORMATE_YYYY_MM_DD = "yyyy-MM-dd";
    public final static String DATE_FORMATE_YYYY_MM_DD_HHMM = "yyyy-MM-dd HH:mm";
    public final static String DATE_FORMATE_YYYY_MM_DD_HHMMSS = "yyyy-MM-dd HH:mm:ss";
    public final static String DATE_FORMATE_YYYYMMDDHHMMSS = "yyyyMMddHHmmss";

    private DateUtils() {
    }

    /*
     * 将一个Date格式的日期格式化为String 使用默认格式：yyyy-MM-dd HH:mm:ss
     * @param date  格式的日期
     * @return 格式化好的日期字符串 String
     */
    public static String formatter(Date date) {
        return formatter(date, DATE_FORMATE_YYYY_MM_DD_HHMMSS);
    }

    /*
     * @desc 将一个Date格式的日期格式化为String
     * @param date  格式的日期
     * @param formatType 格式的日期的类型
     * @return 格式化好的日期字符串 String
     */
    public static String formatter(Date date, String formatType) {
        if (StringUtils.isBlank(formatType) || date == null) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(formatType);
        return sdf.format(date);
    }


    /*
     * @desc 将一个String格式的日期格式化为Data 格式时间：默认当前时间
     * @param formatType 格式的日期的类型
     * @return 格式化好的日期字符串 String
     */
    public static Date formatter(String formatType) {
        try {
            return formatter(new Date().toString(), formatType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /*
     * @desc 将一个String格式的日期格式化为Data
     * @param date 格式时间
     * @param formatType 格式的日期的类型
     * @return 格式化好的日期字符串 String
     */
    public static Date formatter(String date, String formatType) {
        if (StringUtils.isAnyBlank(formatType, date)) {
            return null;
        }
        Date parse = null;
        SimpleDateFormat formatter = new SimpleDateFormat(formatType);
        try {
            parse = formatter.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return parse;
    }


    public static Date getToday() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    public static long getDayStartMillis(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime().getTime();
    }

    public static long getDayEndMillis(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        return calendar.getTime().getTime();
    }

    public static Date getYesterday() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.add(Calendar.DATE, -1);
        return calendar.getTime();
    }

    public static Date getNextDay(int next) {
        return getNextDay(new Date(), next);
    }

    public static Date getNextDay(Date date, int next) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.add(Calendar.DATE, next);
        return calendar.getTime();
    }

    public static int getDayOFMonth() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    public static int nextMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 1);
        return calendar.get(Calendar.MONTH) + 1;
    }

    public static Date previousMonthFirstDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, -1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    public static Date monthFirstDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    public static int month() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.MONTH) + 1;
    }

    /**
     * 获取日
     *
     * @param date
     * @return
     */
    public static int getDay(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * 时间差
     *
     * @param startDate
     * @param endDate
     * @return
     */
    public static Long getDiffDays(Long startDate, Long endDate) {
        Long days = 0L;
        if (compareDate(startDate, endDate) > 0) {
            days = (endDate - startDate) / (1000 * 60 * 60 * 24);
            return days;

        }
        days = (startDate - endDate) / (1000 * 60 * 60 * 24);
        return days;

    }

    /**
     * 比较日期
     *
     * @param date1
     * @param date2
     * @return
     */

    public static int compareDate(Long date1, Long date2) {
        if (date1 > date2) {
            return -1;
        } else if (date1 < date2) {
            return 1;
        } else {
            return 0;
        }
    }


    public static int getMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 1);
        return calendar.get(Calendar.MONTH) + 1;
    }


    /***
     * 日期减一月、加一月
     *
     * @param option
     *            传入类型 pro：日期减一月，next：日期加一月
     * @param _date
     *            2018-11-24
     * @param iMonth
     *             传入天数
     * @return 减一月：2018-12-24或(加一月：2018-10-24)
     */
    public static String getOptionMonth(String option, String _date, int iMonth) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cl = Calendar.getInstance();
        Date date = null;

        try {
            date = sdf.parse(_date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        cl.setTime(date);
        if ("pre".equals(option)) {
            // 时间减一月
            cl.add(Calendar.MONTH, -iMonth);

        } else if ("next".equals(option)) {
            // 时间加一月
            cl.add(Calendar.MONTH, iMonth);
        } else {
            // do nothing
        }
        date = cl.getTime();
        return sdf.format(date);
    }

    /***
     * 日期减一天、加一天
     *
     * @param option
     *            传入类型 pro：日期减一天，next：日期加一天
     * @param _date
     *            2018-11-24
     * @param iday
     *             传入天数
     * @return 减一天：2018-11-23或(加一天：2018-11-25)
     */
    public static String getOptionDay(String option, String _date, int iday) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cl = Calendar.getInstance();
        Date date = null;

        try {
            date = sdf.parse(_date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        cl.setTime(date);
        if ("pre".equals(option)) {
            // 时间减一天
            cl.add(Calendar.DAY_OF_MONTH, -iday);

        } else if ("next".equals(option)) {
            // 时间加一天
            cl.add(Calendar.DAY_OF_YEAR, iday);
        } else {
            // do nothing
        }
        date = cl.getTime();
        return sdf.format(date);
    }


    // long转换为Date类型
    // currentTime要转换的long类型的时间
    // formatType要转换的时间格式yyyy-MM-dd HH:mm:ss//yyyy年MM月dd日 HH时mm分ss秒
    public static Date longToDate(long currentTime, String formatType)
            throws ParseException {
        Date dateOld = new Date(currentTime); // 根据long类型的毫秒数生命一个date类型的时间
        String sDateTime = dateToString(dateOld, formatType); // 把date类型的时间转换为string
        Date date = stringToDate(sDateTime, formatType); // 把String类型转换为Date类型
        return date;
    }

    // string类型转换为date类型
    // strTime要转换的string类型的时间，formatType要转换的格式yyyy-MM-dd HH:mm:ss//yyyy年MM月dd日
    // HH时mm分ss秒，
    // strTime的时间格式必须要与formatType的时间格式相同
    public static Date stringToDate(String strTime, String formatType) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(formatType);
        Date date = null;
        date = formatter.parse(strTime);
        return date;
    }

    // long类型转换为String类型
    // currentTime要转换的long类型的时间
    // formatType要转换的string类型的时间格式
    public static String longToString(long currentTime, String formatType) throws ParseException {
        Date date = longToDate(currentTime, formatType); // long类型转成Date类型
        return dateToString(date, formatType); // date类型转成String
    }

    // date类型转换为String类型
    // formatType格式为yyyy-MM-dd HH:mm:ss//yyyy年MM月dd日 HH时mm分ss秒
    // data Date类型的时间
    public static String dateToString(Date data, String formatType) {
        return new SimpleDateFormat(formatType).format(data);
    }


    /**
     * 相对当前，获取某一年的今天
     *
     * @param n +  往后   -  向前
     * @return
     */
    public static long getYearToday(int n) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR) + n);
        return calendar.getTimeInMillis();
    }

    public static int getDayOfWeek() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.DAY_OF_WEEK) - 1;
    }

    public static int getDayOfWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_WEEK) - 1;
    }

    /**
     * 获取当前日期的本周一是几号
     *
     * @return 本周一的日期
     */
    public static Date getThisWeekBegin() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        // 获得当前日期是一个星期的第几天 使用cal.get(Calendar.DAY_OF_WEEK);
        //获取的数表示的是每个星期的第几天，不能改变，其中星期日为第一天
        // 如果是星期日则获取天数时获取到的数字为1 在后面进行相减的时候出错
        int dayWeek = cal.get(Calendar.DAY_OF_WEEK);
        if (1 == dayWeek) {
            cal.add(Calendar.DAY_OF_MONTH, -1);
        }
        // 设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        // 获得当前日期是一个星期的第几天
        int day = cal.get(Calendar.DAY_OF_WEEK);
        // 根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
        //  cal.getFirstDayOfWeek()根据前面的设置 来动态的改变此值
        cal.add(Calendar.DATE, cal.getFirstDayOfWeek() - day);
        // 获取开始时间
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    public static Date getPastWeekBegin(int i) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(org.apache.commons.lang3.time.DateUtils.addDays(new Date(), -7 * i));
        // 获得当前日期是一个星期的第几天 使用cal.get(Calendar.DAY_OF_WEEK);
        //获取的数表示的是每个星期的第几天，不能改变，其中星期日为第一天
        // 如果是星期日则获取天数时获取到的数字为1 在后面进行相减的时候出错
        int dayWeek = cal.get(Calendar.DAY_OF_WEEK);
        if (1 == dayWeek) {
            cal.add(Calendar.DAY_OF_MONTH, -1);
        }
        // 设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        // 获得当前日期是一个星期的第几天
        int day = cal.get(Calendar.DAY_OF_WEEK);
        // 根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
        //  cal.getFirstDayOfWeek()根据前面的设置 来动态的改变此值
        cal.add(Calendar.DATE, cal.getFirstDayOfWeek() - day);

        // 获取开始时间
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    /**
     * 获取指定日期的年份
     *
     * @param date
     * @return
     */
    public static int getYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }

    /**
     * 获取指定日期的月份
     *
     * @param date
     * @return
     */
    public static int getMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MONTH) + 1;
    }

    /**
     * 获取指定日期的月份
     *
     * @param date
     * @return 格式化后的月份字符串、如01
     */
    public static String getMonthStr(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int month = calendar.get(Calendar.MONTH) + 1;
        return month < 10 ? "0" + month : "" + month;
    }

    /**
     * 获取指定日期的号数
     *
     * @param date
     * @return 格式化后的号数字符串、如01
     */
    public static String getDayStr(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int day = calendar.get(Calendar.DAY_OF_MONTH) + 1;
        return day < 10 ? "0" + day : "" + day;
    }

    /**
     * 获取指定日期对应的年月日组成的数字
     *
     * @param date
     * @return 如：20190909
     */
    public static int getYYYYMMDD(Date date) {
        return Integer.parseInt(formatter(date,DATE_FORMATE_YYYY_MMDD));
    }

    public static void main(String[] args) {
//        System.out.println(getDayOfWeek());
//        System.out.println(getYYYYMMDD(new Date()));
        System.out.println(getMonthStartTime(new Date(1582300799000L)));
        System.out.println(getMonthEndTime(new Date(1582300799000L)));
    }

    /**
     * 获取指定日期的月开始时间
     * @param date
     * @return  毫秒数
     */
    public static Long getMonthStartTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime().getTime();
    }

    /**
     * @Desc 获取月初日期
     * @Author hub5
     * @Date 2022/7/6 14:05
     * @Return {@link }
     **/
    public static Date getMonthStartDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 获取指定日期的月截止时间
     * @param date
     * @return  毫秒数
     */
    public static Long getMonthEndTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        // 下一个月的开始时间减1毫秒、就是当月的截止时间
        calendar.add(Calendar.MONTH, 1);
        return getMonthStartTime(calendar.getTime()) - 1;
    }

    /**
     * 获取指定日期所在月份开始的时间
     * lkeji
     * @return
     */
    public static String getMonthBegin(String specifiedDay) {
        Date data = null;
        try {
            data = new SimpleDateFormat("yyyy-MM-dd").parse(specifiedDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar c = Calendar.getInstance();
        c.setTime(data);
        //设置为1号,当前日期既为本月第一天
        c.set(Calendar.DAY_OF_MONTH, 1);
        //将小时至0
        c.set(Calendar.HOUR_OF_DAY, 0);
        //将分钟至0
        c.set(Calendar.MINUTE, 0);
        //将秒至0
        c.set(Calendar.SECOND,0);
        //将毫秒至0
        c.set(Calendar.MILLISECOND, 0);
        // 本月第一天的时间戳转换为字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date;
        try {
            date = sdf.parse(sdf.format(new Date(new Long(c.getTimeInMillis()))));
            //Date date = sdf.parse(sdf.format(new Long(s)));// 等价于
            return sdf.format(date);
        } catch (NumberFormatException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        } catch (ParseException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 获取指定日期所在月份结束的时间
     * @return
     */
    public static String getMonthEnd(String specifiedDay) {
        Date data = null;
        try {
            data = new SimpleDateFormat("yyyy-MM-dd").parse(specifiedDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar c = Calendar.getInstance();
        c.setTime(data);

        //设置为当月最后一天
        c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
        //将小时至23
        c.set(Calendar.HOUR_OF_DAY, 23);
        //将分钟至59
        c.set(Calendar.MINUTE, 59);
        //将秒至59
        c.set(Calendar.SECOND, 59);
        //将毫秒至999
        c.set(Calendar.MILLISECOND, 999);
        // 本月第一天的时间戳转换为字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date;
        try {
            date = sdf.parse(sdf.format(new Date(new Long(c.getTimeInMillis()))));
            //Date date = sdf.parse(sdf.format(new Long(s)));// 等价于
            return sdf.format(date);
        } catch (NumberFormatException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        } catch (ParseException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        return null;
    }

}
