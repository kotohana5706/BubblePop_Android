package us.buddman.bubblepop.models

import java.io.Serializable

/**
 * Created by Junseok Oh on 2017-08-02.
 */

class User() : Serializable {
    var _id: String = ""
    var thumbnail: String = ""
    var email: String = ""
    var password: String = ""
    var nickname: String = ""
    var age: Int = 0
    var location: Int = 0
    var accountType: String = ""
    var heavencard: String = ""
    var phone : String = ""

    constructor(email: String, nickname: String) : this() {
        this.email = email
        this.nickname = nickname
    }

    constructor(_id: String, thumbnail: String, email: String, password: String, nickname: String, age: Int, location: Int, accountType: String, phone : String) : this() {
        this._id = _id
        this.thumbnail = thumbnail
        this.email = email
        this.password = password
        this.nickname = nickname
        this.age = age
        this.location = location
        this.accountType = accountType
        this.phone = phone
    }

}
