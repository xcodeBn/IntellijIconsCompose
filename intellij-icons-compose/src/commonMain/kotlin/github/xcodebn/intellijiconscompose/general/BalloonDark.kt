package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BalloonDark: ImageVector
    get() {
        if (_BalloonDark != null) return _BalloonDark!!

        _BalloonDark = ImageVector.Builder(
            name = "BalloonDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(11f, 12f)
                lineTo(15f, 6f)
                lineTo(15f, 15f)
                close()
            }
        }.build()

        return _BalloonDark!!
    }

private var _BalloonDark: ImageVector? = null

