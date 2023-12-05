package seminars.fourth.hotel;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookingServiceTest {

    @Test
    void testBooking() {
        HotelService hotelServiceMock = mock(HotelService.class);
        BookingService bookingService = new BookingService(hotelServiceMock);
        when(bookingService.bookRoom(4)).thenReturn(true);

        //Act
        boolean result = bookingService.bookRoom(4);

        //Assert
        assertTrue(result);

    }

    @Test
    void testBookingFalse() {
        HotelService hotelServiceMock = mock(HotelService.class);
        BookingService bookingService = new BookingService(hotelServiceMock);
        when(bookingService.bookRoom(3)).thenReturn(false);

        //Act
        boolean result = bookingService.bookRoom(3);

        //Assert
        assertFalse(result);

    }

}