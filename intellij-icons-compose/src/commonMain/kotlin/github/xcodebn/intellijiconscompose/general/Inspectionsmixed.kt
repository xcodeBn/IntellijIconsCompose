package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Inspectionsmixed: ImageVector
    get() {
        if (_Inspectionsmixed != null) return _Inspectionsmixed!!

        _Inspectionsmixed = ImageVector.Builder(
            name = "Inspectionsmixed",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFEDA200)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 10f)
                lineTo(11f, 1f)
                lineTo(8f, 6f)
                curveTo(9.08f, 6.35f, 9.92f, 6.84f, 10.57f, 7.50f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                curveTo(11.74f, 9.39f, 11.84f, 9.69f, 11.90f, 10.00f)
                horizontalLineTo(16f)
                close()
                moveTo(12f, 6f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                horizontalLineTo(12f)
                verticalLineTo(6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFDB5860)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 15f)
                curveTo(9.21f, 15.00f, 11.00f, 13.21f, 11.00f, 11.00f)
                curveTo(11.00f, 8.79f, 9.21f, 7.00f, 7.00f, 7.00f)
                curveTo(4.79f, 7.00f, 3.00f, 8.79f, 3.00f, 11.00f)
                curveTo(3.00f, 13.21f, 4.79f, 15.00f, 7.00f, 15.00f)
                close()
                moveTo(6f, 9f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                close()
                moveTo(8f, 12f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _Inspectionsmixed!!
    }

private var _Inspectionsmixed: ImageVector? = null

