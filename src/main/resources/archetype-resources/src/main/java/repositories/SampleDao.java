#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.repositories;

import java.io.Serializable;

import ${package}.entities.Sample;
import ${package}.repositories.base.GenericDao;

public interface SampleDao extends GenericDao<Sample, Serializable>{

}
