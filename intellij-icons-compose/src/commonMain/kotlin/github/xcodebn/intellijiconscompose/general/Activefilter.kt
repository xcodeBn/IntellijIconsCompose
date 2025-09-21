package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Activefilter: ImageVector
    get() {
        if (_Activefilter != null) return _Activefilter!!

        _Activefilter = ImageVector.Builder(
            name = "Activefilter",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF389FD6))
            ) {
                moveTo(2f, 2f)
                lineTo(14f, 2f)
                lineTo(14f, 3f)
                lineTo(10f, 8f)
                lineTo(6f, 8f)
                lineTo(2f, 3f)
                close()
            }
        }.build()

        return _Activefilter!!
    }

private var _Activefilter: ImageVector? = null

