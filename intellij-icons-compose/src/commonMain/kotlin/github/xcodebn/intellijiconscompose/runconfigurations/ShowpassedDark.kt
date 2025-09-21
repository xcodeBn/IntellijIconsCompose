package github.xcodebn.intellijiconscompose.runconfigurations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ShowpassedDark: ImageVector
    get() {
        if (_ShowpassedDark != null) return _ShowpassedDark!!

        _ShowpassedDark = ImageVector.Builder(
            name = "ShowpassedDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 13f)
                lineTo(12f, 1f)
                lineTo(9f, 1f)
                lineTo(9f, 11f)
                lineTo(5f, 11f)
                lineTo(5f, 13f)
                close()
            }
        }.build()

        return _ShowpassedDark!!
    }

private var _ShowpassedDark: ImageVector? = null

