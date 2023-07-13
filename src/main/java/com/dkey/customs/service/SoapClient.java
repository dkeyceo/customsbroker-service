package com.dkey.customs.service;

import com.dkey.customs.soapmeta.GetBrokDS;
import com.dkey.customs.soapmeta.GetBrokDSResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import javax.xml.soap.SOAPException;

@Configuration
public class SoapClient {

    @Value("${brokerService.soap.url}")
    private String brokerServiceSoapUrl;
    @Value("${brokerService.soap.getBrokDs.SoapActionCBUrl}")
    private String getBrokDsSoapActionCBUrl;

    @Bean
    public Jaxb2Marshaller getMarshaller()  {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.dkey.customs.soapmeta");
        return marshaller;
    }

    private WebServiceTemplate template;


    public GetBrokDSResponse getBrokDSResponse(GetBrokDS getBrokDs) throws SOAPException {
        template = new WebServiceTemplate(getMarshaller());
        GetBrokDSResponse response = (GetBrokDSResponse) template.marshalSendAndReceive(brokerServiceSoapUrl,
                getBrokDs, new SoapActionCallback(getBrokDsSoapActionCBUrl));
        return response;
    }


}
