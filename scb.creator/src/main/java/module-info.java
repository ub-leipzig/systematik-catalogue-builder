/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
module de.ubleipzig.scb.creator {
    exports de.ubleipzig.scb.creator;
    opens de.ubleipzig.scb.creator to com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.annotation;
    requires org.apache.commons.rdf.api;
    requires slf4j.api;
    requires java.desktop;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.core;
    requires de.ubleipzig.image.metadata;
    requires org.apache.commons.io;
    requires org.trellisldp.client;
    requires jdk.incubator.httpclient;
    //noinspection removal
    requires java.activation;
    requires jsonld.java;
    requires org.apache.commons.rdf.jena;
    requires org.trellisldp.jpms.vocabulary;
    requires de.ubleipzig.iiif.vocabulary;
    requires de.ubleipzig.scb.templates;
    requires org.apache.jena.arq;
    requires commons.cli;
    requires com.fasterxml.jackson.dataformat.yaml;
    uses org.apache.commons.rdf.api.RDF;
}