package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Arrowsplitcenterh: ImageVector
    get() {
        if (_Arrowsplitcenterh != null) return _Arrowsplitcenterh!!

        _Arrowsplitcenterh = ImageVector.Builder(
            name = "Arrowsplitcenterh",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(10f, 6f)
                lineTo(14f, 10f)
                lineTo(7f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(6f, 6f)
                lineTo(9f, 10f)
                lineTo(2f, 10f)
                close()
            }
        }.build()

        return _Arrowsplitcenterh!!
    }

private var _Arrowsplitcenterh: ImageVector? = null

