package github.xcodebn.intellijiconscompose.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cwmaccessoff: ImageVector
    get() {
        if (_Cwmaccessoff != null) return _Cwmaccessoff!!

        _Cwmaccessoff = ImageVector.Builder(
            name = "Cwmaccessoff",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(10f, 5f)
                close()
                moveTo(9f, 13f)
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(13f, 10f)
                close()
                moveTo(15f, 13f)
                lineTo(12f, 11f)
                close()
                moveTo(8f, 11f)
                lineTo(11f, 14f)
                close()
            }
        }.build()

        return _Cwmaccessoff!!
    }

private var _Cwmaccessoff: ImageVector? = null

