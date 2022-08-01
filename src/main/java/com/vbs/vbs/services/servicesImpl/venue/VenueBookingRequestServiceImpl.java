package com.vbs.vbs.services.servicesImpl.venue;

import com.vbs.vbs.dto.client.BookingRequestDto;
import com.vbs.vbs.models.venue.Venue;
import com.vbs.vbs.models.venue.VenueBookingRequest;
import com.vbs.vbs.enums.BookingStatus;
import com.vbs.vbs.repo.venue.VenueBookingRequestRepo;
import com.vbs.vbs.repo.venue.VenueRepo;
import com.vbs.vbs.services.venue.VenueBookingRequestService;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class  VenueBookingRequestServiceImpl implements VenueBookingRequestService {
    private final VenueBookingRequestRepo venueBookingRequestRepo;
    private final VenueRepo venueRepo;


    public VenueBookingRequestServiceImpl(VenueBookingRequestRepo venueBookingRequestRepo,
                                          VenueRepo venueRepo) {
        this.venueBookingRequestRepo = venueBookingRequestRepo;
        this.venueRepo = venueRepo;

    }

    @Override
    public BookingRequestDto VenueBookingRequest(BookingRequestDto bookingRequestDto) {
        VenueBookingRequest entity=new VenueBookingRequest();
        entity.setBookingDate(bookingRequestDto.getBookingDate());
        entity.setFunctionType(bookingRequestDto.getFunctionType());
        entity.setRequiredCapacity(bookingRequestDto.getRequiredCapacity());
        entity.setClientName(bookingRequestDto.getClientName());
        entity.setContactNumber(bookingRequestDto.getContactNumber());

       Optional<Venue> venue = venueRepo.findById(bookingRequestDto.getVenueId());
       Venue venue1 = new Venue();
       if (venue.isPresent()){
           venue1=venue.get();
       }
           entity.setVenue(venue1);
       if (bookingRequestDto.getId() ==null){
           entity.setBookingStatus(BookingStatus.PENDING);
       }
       entity.setPayment(bookingRequestDto.getPayment());
       venueBookingRequestRepo.save(entity);
       return null;
    }

}