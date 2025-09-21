package github.xcodebn.intellijiconscompose.providers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Redshift: ImageVector
    get() {
        if (_Redshift != null) return _Redshift!!

        _Redshift = ImageVector.Builder(
            name = "Redshift",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF4F93D1))
            ) {
                moveTo(2f, 0f)
                lineTo(3f, 1f)
                lineTo(3f, 10f)
                lineTo(2f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1C5A9A))
            ) {
                moveTo(0f, 0f)
                lineTo(2f, 1f)
                lineTo(2f, 10f)
                lineTo(0f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1B5A9A))
            ) {
                moveTo(2f, 0f)
                lineTo(3f, 1f)
                lineTo(3f, 10f)
                lineTo(2f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF4F93D1))
            ) {
                moveTo(0f, 0f)
                lineTo(2f, 1f)
                lineTo(2f, 10f)
                lineTo(0f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1B5A9A))
            ) {
                moveTo(3f, 1f)
                lineTo(5f, 0f)
                lineTo(5f, 14f)
                lineTo(3f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF4F93D1))
            ) {
                moveTo(8f, 1f)
                lineTo(10f, 0f)
                lineTo(10f, 14f)
                lineTo(8f, 13f)
                close()
            }
        }.build()

        return _Redshift!!
    }

private var _Redshift: ImageVector? = null

