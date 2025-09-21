package github.xcodebn.intellijiconscompose.diff

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ApplynotconflictsrightDark: ImageVector
    get() {
        if (_ApplynotconflictsrightDark != null) return _ApplynotconflictsrightDark!!

        _ApplynotconflictsrightDark = ImageVector.Builder(
            name = "ApplynotconflictsrightDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 0f)
                lineTo(0f, 1f)
                lineTo(4f, 5f)
                lineTo(0f, 9f)
                lineTo(2f, 10f)
                lineTo(7f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 0f)
                lineTo(5f, 1f)
                lineTo(9f, 5f)
                lineTo(5f, 9f)
                lineTo(6f, 10f)
                lineTo(11f, 5f)
                close()
            }
        }.build()

        return _ApplynotconflictsrightDark!!
    }

private var _ApplynotconflictsrightDark: ImageVector? = null

