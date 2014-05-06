

import org.scalatest._

class AlbumTest extends FunSpec with ShouldMatchers{

  describe("An Album") {
    it("can add a Artist Object to the Album") {
      val album = new Album("Thriller", 1981,
        new Artist("Michael", "jackason"))
      album.artist.firstName should be ("Michael")
    }
  }
}
