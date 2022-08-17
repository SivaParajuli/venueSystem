package com.vbs.vbs.services;

import com.vbs.vbs.dto.ClientDto;
import com.vbs.vbs.dto.VenueDto;
import com.vbs.vbs.models.Admin;
import com.vbs.vbs.models.Venue;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface RegisterService {

    ClientDto clientRegister(ClientDto clientDto);
    VenueDto venueRegister(VenueDto venueDto);
    List<VenueDto> getAllPendingRegister();
   Integer updateVenueStatus(Integer status, Integer id);
    Admin registerAdmin(Admin admin);


}
