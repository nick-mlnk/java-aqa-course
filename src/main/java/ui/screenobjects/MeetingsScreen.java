package ui.screenobjects;

import com.codeborne.selenide.CollectionCondition;
import ui.components.MeetingComponent;

import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.appium.ScreenObject.screen;
import static io.appium.java_client.AppiumBy.accessibilityId;

public class MeetingsScreen extends BaseScreen {

    public List<MeetingComponent> getMeetings() {
        return $$(accessibilityId("meeting-item"))
                .should(CollectionCondition.sizeGreaterThan(0))
                .asDynamicIterable()
                .stream()
                .map(MeetingComponent::new)
                .collect(Collectors.toList());
    }

    public MeetingComponent getFirstMeeting() {
        return getMeetings().stream()
                .findFirst()
                .get();
    }

    public MeetingDetails selectFirstMeeting() {
        getFirstMeeting()
                .getElement()
                .click();
        return screen(MeetingDetails.class);
    }
}
