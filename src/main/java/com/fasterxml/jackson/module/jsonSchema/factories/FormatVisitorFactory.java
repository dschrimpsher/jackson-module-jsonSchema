package com.fasterxml.jackson.module.jsonSchema.factories;

import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.*;

import com.fasterxml.jackson.module.jsonSchema.types.*;

/**
 * Factory class used for constructing visitors for building various
 * JSON Schema instances via visitor interface.
 */
public class FormatVisitorFactory
{		
    public FormatVisitorFactory() { }

    /*
    /**********************************************************
    /* Factory methods for visitors, structured types
    /**********************************************************
     */

    public JsonAnyFormatVisitor anyFormatVisitor(AnySchema anySchema) {
        return null;
    }

    public JsonArrayFormatVisitor arrayFormatVisitor(SerializerProvider provider,
            ArraySchema arraySchema) {
        return new ArrayVisitor(provider, arraySchema);
    }

    public JsonMapFormatVisitor mapFormatVisitor(SerializerProvider provider,
            ObjectSchema objectSchema) {
        return new MapVisitor(provider, objectSchema);
    }

    public JsonObjectFormatVisitor objectFormatVisitor(SerializerProvider provider,
            ObjectSchema objectSchema) {
        return new ObjectVisitor(provider, objectSchema);
    }
    
    /*
    /**********************************************************
    /* Factory methods for visitors, value types
    /**********************************************************
     */

    public JsonBooleanFormatVisitor booleanFormatVisitor(ValueTypeSchemaFactory parent,
            BooleanSchema booleanSchema) {
        return new BooleanVisitor(parent, booleanSchema);
    }

    public JsonIntegerFormatVisitor integerFormatVisitor(ValueTypeSchemaFactory parent,
            IntegerSchema integerSchema) {
        return new IntegerVisitor(parent, integerSchema);
    }

    public JsonNullFormatVisitor nullFormatVisitor(NullSchema nullSchema) {
        return new NullVisitor(nullSchema);
    }

 	public JsonNumberFormatVisitor numberFormatVisitor(ValueTypeSchemaFactory parent,
 			NumberSchema numberSchema) {
 	    return new NumberVisitor(parent, numberSchema);
 	}

 	public JsonStringFormatVisitor stringFormatVisitor(ValueTypeSchemaFactory parent,
 			StringSchema stringSchema) {
 		return new StringVisitor(parent, stringSchema);
 	}
}