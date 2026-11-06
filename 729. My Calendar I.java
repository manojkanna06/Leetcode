class MyCalendar {
    List<int[]>booking;
    public MyCalendar() {
        booking=new ArrayList<>();
    }
    
    public boolean book(int startTime, int endTime) {
        for(int[] existingBooking :booking){ // Check if the two intervals overlap 
            if(existingBooking[1]>startTime && existingBooking[0]<endTime)
                return false;
        }
        booking.add(new int[]{startTime,endTime});// No overlap, so add the new booking to the list
        return true;
    }
}
/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */
