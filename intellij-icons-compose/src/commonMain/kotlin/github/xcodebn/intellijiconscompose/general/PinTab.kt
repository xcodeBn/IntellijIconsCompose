package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PinTab: ImageVector
    get() {
        if (_PinTab != null) return _PinTab!!

        _PinTab = ImageVector.Builder(
            name = "PinTab",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(11f, 9f)
                lineTo(15f, 6f)
                lineTo(10f, 1f)
                lineTo(7f, 5f)
                lineTo(3f, 5f)
                lineTo(6f, 8f)
                lineTo(1f, 15f)
                lineTo(1f, 15f)
                lineTo(8f, 10f)
                lineTo(11f, 12f)
                close()
            }
        }.build()

        return _PinTab!!
    }

private var _PinTab: ImageVector? = null

