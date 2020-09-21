import request from "@/utils/request";

export interface UmsUserVO {
  id: number,
  name: string,
  role: RoleType,
}

export enum RoleType {
  S= 'S',
  T = 'T',
  P = 'P',
  M = 'M',
}

class Ums {
  getAllUser() : Promise<Array<UmsUserVO>> {
    return request.get("/ums/user");
  }
}

export default Ums;
