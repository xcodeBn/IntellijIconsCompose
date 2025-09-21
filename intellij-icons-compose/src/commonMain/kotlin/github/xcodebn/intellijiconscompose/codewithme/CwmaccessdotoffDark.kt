package github.xcodebn.intellijiconscompose.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CwmaccessdotoffDark: ImageVector
    get() {
        if (_CwmaccessdotoffDark != null) return _CwmaccessdotoffDark!!

        _CwmaccessdotoffDark = ImageVector.Builder(
            name = "CwmaccessdotoffDark",
            defaultWidth = 12.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(6f, 5f)
                moveTo(8f, 8f)
                lineTo(5f, 6f)
                close()
                moveTo(4f, 8f)
                lineTo(7f, 10f)
                close()
            }
        }.build()

        return _CwmaccessdotoffDark!!
    }

private var _CwmaccessdotoffDark: ImageVector? = null

