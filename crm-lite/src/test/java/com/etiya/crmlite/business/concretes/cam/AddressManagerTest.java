package com.etiya.crmlite.business.concretes.cam;
import com.etiya.crmlite.business.abstracts.cam.ICustomerService;
import com.etiya.crmlite.business.dtos.requests.cam.addresses.CreateAddressRequest;
import com.etiya.crmlite.business.dtos.requests.cam.addresses.UpdateAddressRequest;
import com.etiya.crmlite.business.dtos.responses.cam.addresses.GetAllAddressResponse;
import com.etiya.crmlite.business.dtos.responses.cam.addresses.GetByIdAddressResponse;
import com.etiya.crmlite.core.util.mapper.ModelMapperManager;
import com.etiya.crmlite.core.util.message.IMessageService;
import com.etiya.crmlite.core.util.results.DataResult;
import com.etiya.crmlite.core.util.results.Result;
import com.etiya.crmlite.core.util.results.SuccessDataResult;
import com.etiya.crmlite.entities.concretes.cam.Addr;
import com.etiya.crmlite.repositories.cam.IAddressRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class AddressManagerTest {

    private AddressManager addressManager;
    // MOCK

    private ICustomerService customerService;
    private IMessageService messageService;
    private MessageSource messageSource;


    private IAddressRepository addressRepository;

    @BeforeEach
    void setUp(){
        addressRepository = mock(IAddressRepository.class);
        customerService = mock(ICustomerService.class);
        //messageSource = mock(MessageSource.class);
        messageSource = getResourceBundle();
        messageService = mock(IMessageService.class);
        addressManager = new AddressManager(addressRepository,customerService,messageSource,messageService);
    }

    ResourceBundleMessageSource getResourceBundle(){
        ResourceBundleMessageSource source = new ResourceBundleMessageSource();
        source.setBasename("messages.properties");
        return source;
    }
    @Test
    void getAll() {

            // Set up mock data
            Addr addr1 = Addr.builder()
                    .addrId(1L)
                    .addrDesc("Address 1")
                    .bldgId(10L)
                    .cityName("City 1")
                    .cntryName("Country 1")
                    .strtId(100L)
                    .strtName("Street 1")
                    .build();
            Addr addr2 = Addr.builder()
                    .addrId(2L)
                    .addrDesc("Address 2")
                    .bldgId(20L)
                    .cityName("City 2")
                    .cntryName("Country 2")
                    .strtId(200L)
                    .strtName("Street 2")
                    .build();
            List<Addr> mockAddrList = new ArrayList<>();
            mockAddrList.add(addr1);
            mockAddrList.add(addr2);

            // Set up mock behavior
            when(addressRepository.findAll()).thenReturn(mockAddrList);
            // Call method under test
            DataResult<List<GetAllAddressResponse>> result = addressManager.getAll();
            // Verify result

            assertNotNull(result);
            //assertEquals("All address have been successfully called", result.getMessage());
            assertNotNull(result.getData());
            assertEquals(2, result.getData().size());
            assertEquals(1L, result.getData().get(0).getAddressId());
            assertEquals("Address 1", result.getData().get(0).getAddressDescription());
            assertEquals(10L, result.getData().get(0).getBuildingId());
            assertEquals("City 1", result.getData().get(0).getCityName());
            assertEquals("Country 1", result.getData().get(0).getCountryName());
            assertEquals(100L, result.getData().get(0).getStreetId());
            assertEquals("Street 1", result.getData().get(0).getStreetName());

            assertEquals(2L, result.getData().get(1).getAddressId());
            assertEquals("Address 2", result.getData().get(1).getAddressDescription());
            assertEquals(20L, result.getData().get(1).getBuildingId());
            assertEquals("City 2", result.getData().get(1).getCityName());
            assertEquals("Country 2",result.getData().get(1).getCountryName());
            assertEquals(200L, result.getData().get(1).getStreetId());
            assertEquals("Street 2", result.getData().get(1).getStreetName());

    }



    @Test
    void getById() {
        Addr addr = Addr.builder()
                .addrId(1L)
                .addrDesc("Address 1")
                .bldgId(10L)
                .cityName("City 1")
                .cntryName("Country 1")
                .strtId(100L)
                .strtName("Street 1")
                .build();

        // Set up mock behavior
        when(addressRepository.findById(1L)).thenReturn(java.util.Optional.of(addr));

        // Call method under test
        DataResult<GetByIdAddressResponse> result = addressManager.getById(1L);

        // Verify result
        assertNotNull(result);
        assertEquals("This address was called successfully", result.getMessage());
        assertNotNull(result.getData());
        assertEquals(1L, result.getData().getAddressId());
        assertEquals("Address 1", result.getData().getAddressDescription());
        assertEquals(10L, result.getData().getBuildingId());
        assertEquals("City 1", result.getData().getCityName());
        assertEquals("Country 1", result.getData().getCountryName());
        assertEquals(100L, result.getData().getStreetId());
        assertEquals("Street 1", result.getData().getStreetName());
    }

    @Test
    void addAddress() {
        CreateAddressRequest createAddressRequest = CreateAddressRequest.builder()
                .addressDescription("Address 1")
                .buildingId(10L)
                .cityName("City 1")
                .countryName("Country 1")
                .streetId(100L)
                .streetName("Street 1")
                .build();
        Addr addrToAdd = Addr.builder()
                .addrDesc("Address 1")
                .bldgId(10L)
                .cityName("City 1")
                .cntryName("Country 1")
                .strtId(100L)
                .strtName("Street 1")
                .build();
        when(addressRepository.save(any())).thenReturn(addrToAdd);
        Result response = addressManager.addAddress(createAddressRequest);

        assertNotNull(when(addressRepository.save(any())).thenReturn(addrToAdd));
        assertEquals("Adres başarı ile eklendi!",response.getMessage());


    }

    @Test
    void deleteAddress() {
//        // Set up mock data
//        Addr addr = Addr.builder()
//                .addrId(1L)
//                .addrDesc("Address 1")
//                .bldgId(10L)
//                .cityName("City 1")
//                .cntryName("Country 1")
//                .strtId(100L)
//                .strtName("Street 1")
//                .isActv(1)
//                .build();
//
//        // Set up mock behavior
//        when(addressRepository.findById(1L)).thenReturn(java.util.Optional.of(addr));
//        when(addressRepository.save(addr));
//
//        // Call method under test
//        SuccessDataResult result = addressManager.deleteAddress(1L);
//
//        // Verify result
//        assertNotNull(result);
//        assertEquals("Adres başarı ile silindi!", result.getMessage());
//        assertEquals(0, addr.getIsActv());
//        assertEquals("2022-01-01", addr.getCDate());
    }


    @Test
    void updateAddress() {
            // Set up mock data
            Addr addr = Addr.builder()
                    .addrId(1L)
                    .rowId(1L)
                    .dataTypeId(1L)
                    .strtId(100L)
                    .bldgId(10L)
                    .addrDesc("Address 1")
                    .isActv(1)
                    .cityName("City 1")
                    .strtName("Street 1")
                    .bldgName("Building 1")
                    .cntryName("Country 1")
                    .build();
            UpdateAddressRequest updateAddressRequest = UpdateAddressRequest.builder()
                    .addressId(1L)
                    .streetId(200L)
                    .buildingId(20L)
                    .addressDescription("Updated Address")
                    .isActive(0)
                    .cityName("Updated City")
                    .streetName("Updated Street")
                    .buildingName("Updated Building")
                    .countryName("Updated Country")
                    .build();

            // Set up mock behavior
            when(addressRepository.findById(1L)).thenReturn(java.util.Optional.of(addr));

            // Call method under test
            Result result = addressManager.updateAddress(1L, updateAddressRequest);

            // Verify result
            assertNotNull(result);
            assertEquals("ADDRESS.UPDATED", result.getMessage());
            assertEquals(1L, addr.getAddrId());
            assertEquals(1L, addr.getRowId());
            assertEquals(1L, addr.getDataTypeId());
            assertEquals(200L, addr.getStrtId());
            assertEquals(20L, addr.getBldgId());
            assertEquals("Updated Address", addr.getAddrDesc());
            assertEquals(0, addr.getIsActv());
            assertEquals("Updated City", addr.getCityName());
            assertEquals("Updated Street", addr.getStrtName());
            assertEquals("Updated Building", addr.getBldgName());
            assertEquals("Updated Country", addr.getCntryName());
        }



    @Test
    void addAddressForCreateCustomer() {
    }

    @Test
    void customerUpdateAddress() {
    }

    @Test
    void getAllCustomerAddresses() {
    }

    @Test
    void getAllWithPage() {
    }

}