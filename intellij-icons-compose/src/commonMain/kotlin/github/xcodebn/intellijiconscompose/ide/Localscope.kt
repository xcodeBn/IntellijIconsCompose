package github.xcodebn.intellijiconscompose.ide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Localscope: ImageVector
    get() {
        if (_Localscope != null) return _Localscope!!

        _Localscope = ImageVector.Builder(
            name = "Localscope",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(7f, 14f)
                curveTo(3.13f, 14.00f, 0.00f, 10.87f, 0.00f, 7.00f)
                curveTo(0.00f, 3.13f, 3.13f, 0.00f, 7.00f, 0.00f)
                curveTo(10.87f, 0.00f, 14.00f, 3.13f, 14.00f, 7.00f)
                curveTo(14.00f, 10.87f, 10.87f, 14.00f, 7.00f, 14.00f)
                close()
                moveTo(7f, 12f)
                curveTo(9.71f, 11.90f, 11.90f, 9.71f, 11.90f, 7.00f)
                curveTo(11.90f, 4.29f, 9.71f, 2.10f, 7.00f, 2.10f)
                curveTo(4.29f, 2.10f, 2.10f, 4.29f, 2.10f, 7.00f)
                curveTo(2.10f, 9.71f, 4.29f, 11.90f, 7.00f, 11.90f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(7f, 14f)
                    curveTo(3.13f, 14.00f, 0.00f, 10.87f, 0.00f, 7.00f)
                    curveTo(0.00f, 3.13f, 3.13f, 0.00f, 7.00f, 0.00f)
                    curveTo(10.87f, 0.00f, 14.00f, 3.13f, 14.00f, 7.00f)
                    curveTo(14.00f, 10.87f, 10.87f, 14.00f, 7.00f, 14.00f)
                    close()
                    moveTo(7f, 12f)
                    curveTo(9.71f, 11.90f, 11.90f, 9.71f, 11.90f, 7.00f)
                    curveTo(11.90f, 4.29f, 9.71f, 2.10f, 7.00f, 2.10f)
                    curveTo(4.29f, 2.10f, 2.10f, 4.29f, 2.10f, 7.00f)
                    curveTo(2.10f, 9.71f, 4.29f, 11.90f, 7.00f, 11.90f)
                    close()
                }
            }
        }.build()

        return _Localscope!!
    }

private var _Localscope: ImageVector? = null

