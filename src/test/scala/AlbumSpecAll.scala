import org.scalatest.matchers.ShouldMatchers
import org.scalatest.{Tag, GivenWhenThen, FunSpec}

class AlbumSpecAll extends FunSpec with ShouldMatchers with GivenWhenThen {

  describe("An Album") {

    it("can add an Artist to the album at construction time",
      Tag("construction")) {

      Given("The Album Thriller by Michael Jackson")
      val album = new Album("Thriller", 1981, new Artist("Michael", "Jackson"))

      When("the artist of the album is obtained")
      val artist = album.artist

      Then("the artist should be an instance of Artist")
      artist.isInstanceOf[Artist] should be (true)

      And("the artists first name and last name should be Michael Jackson")
      artist.firstName should be ("Michael")
      artist.lastName should be ("Jackson")

      info("This is still pending since there may be more to accomplisch in test")
      pending
    }

    ignore("can add a Producer to an album at construction time") {
      //TODO: Add some logic.
    }
  }
}
