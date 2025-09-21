package github.xcodebn.intellijiconscompose.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cwmaccessdotoff: ImageVector
    get() {
        if (_Cwmaccessdotoff != null) return _Cwmaccessdotoff!!

        _Cwmaccessdotoff = ImageVector.Builder(
            name = "Cwmaccessdotoff",
            defaultWidth = 12.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
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

        return _Cwmaccessdotoff!!
    }

private var _Cwmaccessdotoff: ImageVector? = null

