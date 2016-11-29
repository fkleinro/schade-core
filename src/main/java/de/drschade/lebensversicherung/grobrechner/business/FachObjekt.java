package de.drschade.lebensversicherung.grobrechner.business;

import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class FachObjekt {
   
   private static final Logger logger = LoggerFactory.getLogger(FachObjekt.class);


   public abstract String toPrettyString();


   public abstract Integer getId();
   
   /**
    * Gibt die Klassennamen und die ID als String zurück.
    */
   public String toObjectString() {
      StringBuilder sb = new StringBuilder();
      sb.append(this.getClass().getSimpleName());
      sb.append(":");
      sb.append(getId() != null ? getId() : "#" + hashCode());
      return sb.toString();
   }

   public String toJsonString() {
      ObjectMapper mapper = new ObjectMapper();
      mapper.configure(SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS, false);
      try {       
         return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(this);
      } catch (IOException ex) {
         ex.printStackTrace();
      }
      return "";
   }

}
