package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CProtected: ImageVector
    get() {
        if (_CProtected != null) return _CProtected!!

        _CProtected = ImageVector.Builder(
            name = "CProtected",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 8f)
                curveTo(8.01f, 6.70f, 7.09f, 6.00f, 6.00f, 6.00f)
                curveTo(4.62f, 6.00f, 3.50f, 7.12f, 3.50f, 8.50f)
                curveTo(3.50f, 9.88f, 4.62f, 11.00f, 6.00f, 11.00f)
                curveTo(7.09f, 11.00f, 8.01f, 10.30f, 8.35f, 9.33f)
                lineTo(10f, 9f)
                lineTo(10f, 11f)
                lineTo(12f, 11f)
                lineTo(12f, 9f)
                lineTo(12f, 9f)
                lineTo(12f, 8f)
                lineTo(8f, 8f)
                close()
                moveTo(6f, 9f)
                curveTo(5.54f, 9.33f, 5.17f, 8.96f, 5.17f, 8.50f)
                curveTo(5.17f, 8.04f, 5.54f, 7.67f, 6.00f, 7.67f)
                curveTo(6.46f, 7.67f, 6.83f, 8.04f, 6.83f, 8.50f)
                curveTo(6.83f, 8.96f, 6.46f, 9.33f, 6.00f, 9.33f)
                close()
            }
        }.build()

        return _CProtected!!
    }

private var _CProtected: ImageVector? = null

