import org.scalatest._
import org.scalatest.matchers.ShouldMatchers

class AlbumSpec extends FunSpec with ShouldMatchers with GivenWhenThen {

  describe("An Album") {
    it("can add an Artist to the album at construction time") {
      Given("The Album Thriller by Michael Jackson")
      val album = new Album("Thriller", 1981, new Artist("Michael", "Jackson"))

      When("the albums artist is obtained")
      val artist = album.artist

      Then("the artist obtained should be an instance of Artist")
      artist.isInstanceOf[Artist] should be (true)

      And("the artists first name and last should be Michael Jackson")
      artist.firstName should be ("Michael")

      artist.lastName should be ("Jackson")
    }
  }
}
