<?php
  // Path du WSDL Service
  $wsdl = "http://0.0.0.0:8686/BanqueWS?wsdl";

  // COnnection
  $options = array('features' => 
    SOAP_USE_XSI_ARRAY_TYPE + SOAP_SINGLE_ELEMENT_ARRAYS);

  // Création du SoapCLient
  $client = new SoapClient($wsdl, $options);
  echo "SoapClient créer!<br>\n";

  // Appele fonction conversion
  $response = $client->conversionEuroToDH(200);
  echo $response."\n";
?>