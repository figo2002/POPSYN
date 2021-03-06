/*
 * Copyright 2011 San Diego Association of Governments (SANDAG)


 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations
 * under the License.
 */
package org.sandag.popsyn.io;

import java.util.ArrayList;
import java.util.Set;
import org.sandag.popsyn.Version;
import org.sandag.popsyn.domain.IGeoWeightedObject;
import org.sandag.popsyn.enums.GeographyType;

/**
 * This interface defines methods that write households to the database. 
 *
 */
public interface IWriterDao
{
    /**
     * Writes discretized or allocated households by zone to the database
     * @param zoneId zone ID
     * @param geoType geography type 
     * @param hhs a set of household objects
     * @param version the Version object for this PopSyn II run
     * @param writeAllocated a boolean where true indicates the insertion of allocated households 
     * and false indicates the insertion of discretized households.
     * @return 0 for successful execution and -1 for fatal error.   
     */
    int persistHouseholds(Integer zoneId, GeographyType geoType, Set<IGeoWeightedObject> hhs,
            Version version, boolean writeAllocated);
    int persistHouseholds(Integer zoneId, GeographyType geoType, ArrayList<IGeoWeightedObject> hhs,
            Version version, boolean writeAllocated);
}
