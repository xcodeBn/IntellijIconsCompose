package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Arrowsplitcenterv: ImageVector
    get() {
        if (_Arrowsplitcenterv != null) return _Arrowsplitcenterv!!

        _Arrowsplitcenterv = ImageVector.Builder(
            name = "Arrowsplitcenterv",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(8f, 4f)
                lineTo(10f, 7f)
                lineTo(6f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(8f, 9f)
                lineTo(10f, 12f)
                lineTo(6f, 12f)
                close()
            }
        }.build()

        return _Arrowsplitcenterv!!
    }

private var _Arrowsplitcenterv: ImageVector? = null

