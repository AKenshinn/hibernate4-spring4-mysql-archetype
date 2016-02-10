#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.services;

import java.io.Serializable;

import ${package}.entities.Sample;
import ${package}.services.base.GenericService;

public interface SampleService extends GenericService<Sample, Serializable> {

}
