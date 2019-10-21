// Copyright 2015-2019 SWIM.AI inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package swim.basic;

import swim.api.SwimRoute;
import swim.api.agent.AgentRoute;
import swim.fabric.Fabric;
import swim.kernel.Kernel;
import swim.api.plane.AbstractPlane;
import swim.server.ServerLoader;
import swim.structure.Value;

public class BasicPlane extends AbstractPlane {
  
  @SwimRoute ("/unit/:id")
  AgentRoute<UnitAgent> unitAgentType;
  
  public static void main(String[] args) {
    final Kernel kernel = ServerLoader.loadServer();
    final Fabric fabric = (Fabric) kernel.getSpace("basic");
    
    kernel.start();
    System.out.println("Running Basic server...");
    kernel.run();
    
    fabric.command("/unit/foo", "wakeup", Value.absent());
  }
}