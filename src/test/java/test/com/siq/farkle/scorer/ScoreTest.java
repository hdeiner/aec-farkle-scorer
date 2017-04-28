package test.com.siq.farkle.scorer;

import com.siq.farkle.scorer.Score;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ScoreTest {

    @Test
    public void canRecognizeStraight() {
        Score score = new Score("246135");
        assertThat(score.calculate(), is(1200));
    }

    @Test
    public void canRecognizeThreePairs() {
        Score score = new Score("432234");
        assertThat(score.calculate(), is(800));
    }

    @Test
    public void canRecognizeSixOnes() {
        Score score = new Score("111111");
        assertThat(score.calculate(), is(8000));
    }

    @Test
    public void canRecognizeThreeOnes() {
        Score score = new Score("213411");
        assertThat(score.calculate(), is(1000));
    }

    @Test
    public void canRecognizeSixTwos() {
        Score score = new Score("222222");
        assertThat(score.calculate(), is(1600));
    }

    @Test
    public void canRecognizeThreeTwos() {
        Score score = new Score("423224");
        assertThat(score.calculate(), is(200));
    }

    @Test
    public void canRecognizeSixThrees() {
        Score score = new Score("333333");
        assertThat(score.calculate(), is(2400));
    }

    @Test
    public void canRecognizeThreeThrees() {
        Score score = new Score("323234");
        assertThat(score.calculate(), is(300));
    }

    @Test
    public void canRecognizeSixFours() {
        Score score = new Score("444444");
        assertThat(score.calculate(), is(3200));
    }

    @Test
    public void canRecognizeThreeFours() {
        Score score = new Score("323444");
        assertThat(score.calculate(), is(400));
    }

    @Test
    public void canRecognizeSixFives() {
        Score score = new Score("555555");
        assertThat(score.calculate(), is(4000));
    }

    @Test
    public void canRecognizeThreeFives() {
        Score score = new Score("325655");
        assertThat(score.calculate(), is(500));
    }

    @Test
    public void canRecognizeSixSixs() {
        Score score = new Score("666666");
        assertThat(score.calculate(), is(4800));
    }

    @Test
    public void canRecognizeFiveOnes() {
        Score score = new Score("111112");
        assertThat(score.calculate(), is(4000));
    }

    @Test
    public void canRecognizeFiveTwos() {
        Score score = new Score("232222");
        assertThat(score.calculate(), is(800));
    }

    @Test
    public void canRecognizeFiveThrees() {
        Score score = new Score("633333");
        assertThat(score.calculate(), is(1200));
    }

    @Test
    public void canRecognizeFiveFours() {
        Score score = new Score("544444");
        assertThat(score.calculate(), is(1600));
    }

    @Test
    public void canRecognizeFiveFives() {
        Score score = new Score("555255");
        assertThat(score.calculate(), is(2000));
    }

    @Test
    public void canRecognizeFiveSixs() {
        Score score = new Score("166666");
        assertThat(score.calculate(), is(2400));
    }


    @Test
    public void canRecognizeFourOnes() {
        Score score = new Score("113112");
        assertThat(score.calculate(), is(2000));
    }

    @Test
    public void canRecognizeFourTwos() {
        Score score = new Score("232224");
        assertThat(score.calculate(), is(400));
    }

    @Test
    public void canRecognizeFourThrees() {
        Score score = new Score("633343");
        assertThat(score.calculate(), is(600));
    }

    @Test
    public void canRecognizeFourFours() {
        Score score = new Score("514444");
        assertThat(score.calculate(), is(800));
    }

    @Test
    public void canRecognizeFourFives() {
        Score score = new Score("655255");
        assertThat(score.calculate(), is(1000));
    }

    @Test
    public void canRecognizeFourSixs() {
        Score score = new Score("166662");
        assertThat(score.calculate(), is(1200));
    }

    @Test
    public void canRecognizeThreeSixs() {
        Score score = new Score("666324");
        assertThat(score.calculate(), is(600));
    }

    @Test
    public void canRecognizeThreeOnesThreeTwos() {
        Score score = new Score("121212");
        assertThat(score.calculate(), is(1200));
    }

    @Test
    public void canRecognizeThreeOnesOneFive() {
        Score score = new Score("121315");
        assertThat(score.calculate(), is(1050));
    }

    @Test
    public void canRecognizeThreeOnesTwoFives() {
        Score score = new Score("121515");
        assertThat(score.calculate(), is(1100));
    }

    @Test
    public void canRecognizeThreeFivesTwoOnes() {
        Score score = new Score("555311");
        assertThat(score.calculate(), is(700));
    }

    @Test
    public void canRecognizeThreeFivesOneOne() {
        Score score = new Score("124555");
        assertThat(score.calculate(), is(600));
    }

    @Test
    public void canRecognizeTwoOnes() {
        Score score = new Score("321143");
        assertThat(score.calculate(), is(200));
    }

    @Test
    public void canRecognizeOneOne() {
        Score score = new Score("322143");
        assertThat(score.calculate(), is(100));
    }
    @Test
    public void canRecognizeTwoFives() {
        Score score = new Score("325543");
        assertThat(score.calculate(), is(100));
    }

    @Test
    public void canRecognizeOneFive() {
        Score score = new Score("322543");
        assertThat(score.calculate(), is(50));
    }


}
