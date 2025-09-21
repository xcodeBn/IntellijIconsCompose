package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Locked: ImageVector
    get() {
        if (_Locked != null) return _Locked!!

        _Locked = ImageVector.Builder(
            name = "Locked",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 10f)
                curveTo(13.22f, 10.00f, 13.00f, 10.31f, 13.00f, 10.70f)
                lineTo(13f, 13f)
                curveTo(13.00f, 13.69f, 13.22f, 14.00f, 13.50f, 14.00f)
                curveTo(13.78f, 14.00f, 14.00f, 13.69f, 14.00f, 13.30f)
                lineTo(14f, 11f)
                curveTo(14.00f, 10.31f, 13.78f, 10.00f, 13.50f, 10.00f)
                close()
                moveTo(14f, 9f)
                curveTo(14.33f, 9.00f, 15.00f, 9.67f, 15.00f, 10.50f)
                lineTo(15f, 13f)
                curveTo(15.00f, 13.83f, 14.33f, 14.50f, 13.50f, 14.50f)
                curveTo(12.67f, 14.50f, 12.00f, 13.83f, 12.00f, 13.00f)
                lineTo(12f, 10f)
                curveTo(12.00f, 9.67f, 12.67f, 9.00f, 13.50f, 9.00f)
                close()
            }
        }.build()

        return _Locked!!
    }

private var _Locked: ImageVector? = null

