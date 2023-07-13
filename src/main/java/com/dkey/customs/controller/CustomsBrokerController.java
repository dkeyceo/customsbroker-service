package com.dkey.customs.controller;

import com.dkey.customs.service.SoapClient;
import com.dkey.customs.soapmeta.GetBrokDS;
import com.dkey.customs.soapmeta.GetBrokDSResponse;
import com.dkey.customs.soapmeta.GetBrokDsReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.soap.SOAPException;
import java.math.BigDecimal;

@RestController
@RequestMapping("/")
public class CustomsBrokerController {

    @Autowired
    private SoapClient soapClient;

    @GetMapping(value = "/brokers", produces = { MediaType.APPLICATION_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_XML_VALUE})
    public ResponseEntity getBrokerByCode(@RequestParam BigDecimal code) throws SOAPException {

        GetBrokDS type = new GetBrokDS();
        GetBrokDsReq req = new GetBrokDsReq();
        req.setCode(code);
        type.setReq(req);
        GetBrokDSResponse response = soapClient.getBrokDSResponse(type);
        return new ResponseEntity(response.getGetBrokDSResult().getXML(), HttpStatus.OK);
    }
}
