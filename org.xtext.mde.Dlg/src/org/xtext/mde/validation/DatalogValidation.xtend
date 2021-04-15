package org.xtext.mde.validation

import org.eclipse.xtext.validation.Check
import org.xtext.mde.datalog.Conditions
import org.xtext.mde.datalog.DatalogPackage

class DatalogValidation extends AbstractDatalogValidator {
	
	 	public static val INVALID_START_PROGRAM = 'datalog.INVALID_START_PROGRAM'
	
		@Check
		def checkConditionStartsWithLowerCharacter(Conditions conditions) {
			if(!Character.isLowerCase(conditions.cond.toString.charAt(0))) {
				warning('Condition should start with a lower character', conditions, 
						DatalogPackage.Literals.CONDITIONS__COND,
						INVALID_START_PROGRAM);
			}
		}
}